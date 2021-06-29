package com.example.Customerwebpage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorycustomer extends JpaRepository<Usercls, Long> {
        Usercls findByEmail(String email);
}
