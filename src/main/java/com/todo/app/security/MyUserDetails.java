package com.todo.app.security;

import com.todo.app.model.Authority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.todo.app.model.Person;

public class MyUserDetails implements UserDetails {

    private String username;
    private String password;
    private List<GrantedAuthority> authorities;
    private boolean isActive;

    public MyUserDetails(Person person){
          this.username = person.getUsername();
          this.password = person.getPassword();
          this.authorities = new ArrayList<>();
          List<Authority> authorities = new ArrayList<>();
          authorities = person.getAuthorities();
          for (Authority authority : authorities){
              this.authorities.add(new SimpleGrantedAuthority(authority.getAuthority()));
          }
          this.isActive = true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isActive;
    }
}
