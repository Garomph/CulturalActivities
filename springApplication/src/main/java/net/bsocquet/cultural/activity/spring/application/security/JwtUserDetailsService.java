package net.bsocquet.cultural.activity.spring.application.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("admin".equals(username)) {
            return new User("admin", "$2y$10$9Dq9ZdlxhxTZAdkvBrXxSuIyk9cLGEOFgBaFBH6.VvD3e.WsQMnBG", new ArrayList<>()); // Password is BCrypt
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
