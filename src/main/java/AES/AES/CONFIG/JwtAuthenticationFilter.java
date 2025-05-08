/*package AES.AES.CONFIG;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Inicialización si es necesario
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Aquí deberías verificar el token JWT y establecer la autenticación
        String token = httpRequest.getHeader("Authorization");

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);  // Eliminar el prefijo "Bearer "
            // Aquí verificarías el token, y si es válido, añadir la autenticación
            // Si no es válido, puedes devolver un error 401 (Unauthorized)
        } else {
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Token JWT no proporcionado o no válido");
            return;
        }

        // Continuar con la cadena de filtros si el token es válido
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Limpieza si es necesario
    }
}*/
