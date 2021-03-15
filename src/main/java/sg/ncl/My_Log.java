package sg.ncl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class My_Log {
    private String GetRemoteClientIP(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public my_log(String severity, String msg, HttpServletRequest request) {
        if (severity == "warn") {
            log.warn("{}, client_ip={}", msg, GetRemoteClientIP(request));
        }
        if (severity == "error") {
            log.error("{}, client_ip={}", msg, GetRemoteClientIP(request));
        }
    }
}
