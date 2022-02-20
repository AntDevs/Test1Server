package com.test1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {

    @GetMapping("/test")
    public String home() {
		System.out.print("test Called");
		return "HI";
    }
	
    @RequestMapping(value = "/downloads/{fileName:.+}", method = RequestMethod.GET)
    public void downloadFile(
            @PathVariable("fileName") String fileName,
            //@PathVariable("fileExt") String fileExt,
            HttpServletResponse response) throws IOException {
        HashMap traceParam = new HashMap();

        SALogger.trace(traceParam, "Start fileName:" + fileName);

        try {

            String src= logConfig.getDownloadSourcePath() + "/" + fileName;
            SALogger.trace(traceParam, "Open file:" + src);
            if ( new File(src).exists() ) {
                String[] fileDtl = fileName.split(Pattern.quote("."));
                String fileExt = "." + fileDtl[fileDtl.length-1];
                response.addHeader("Content-disposition", "attachment; filename=" + fileName);
                response.setContentType("application/" + fileExt);
                InputStream is = new FileInputStream(src);
                IOUtils.copy(is, response.getOutputStream());
                response.flushBuffer();
            } else {
                String hostname = InetAddress.getLocalHost().getHostName();
                response.setStatus(404);
                response.getWriter().append("File " + src + " not found on " + hostname );
            }
            SALogger.trace(traceParam, "End fileName:" + fileName);
        } catch ( Exception e){
            e.printStackTrace();
            SALogger.trace(traceParam, "Err:" + e.getMessage());
        }

    }
	
}
