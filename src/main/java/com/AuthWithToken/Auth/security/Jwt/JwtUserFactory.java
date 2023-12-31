package com.AuthWithToken.Auth.security.Jwt;

import com.AuthWithToken.Auth.model.Role;
import com.AuthWithToken.Auth.model.Status;
import com.AuthWithToken.Auth.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {
    public JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                        user.getId(),
                        user.getUsername(),
                        user.getEmail(),
                        user.getPassword(),
                user.getStatus().equals(Status.ACTIVE),
                mapToGrantedAuthorities(new ArrayList<>(user.getRoles()))
                );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> userRoles) {
        return userRoles.stream()
                .map(role ->
                        new SimpleGrantedAuthority(role.getName())
                ).collect(Collectors.toList());
    }
}
