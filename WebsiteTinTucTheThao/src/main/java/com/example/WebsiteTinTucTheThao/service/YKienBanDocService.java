/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.WebsiteTinTucTheThao.service;

import com.example.WebsiteTinTucTheThao.model.YKienBanDocModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dovan
 */
public interface YKienBanDocService {

    long count();

    void delete(YKienBanDocModel entity);

    void deleteAll();

    void deleteAll(List<YKienBanDocModel> entities);

    void deleteAllById(List<Integer> ids);

    void deleteById(Integer id);

    boolean existsById(Integer id);

    List<YKienBanDocModel> findAll();

    List<YKienBanDocModel> findAllById(List<Integer> ids);

    Optional<YKienBanDocModel> findById(Integer id);

    YKienBanDocModel save(YKienBanDocModel entity);

    List<YKienBanDocModel> saveAll(List<YKienBanDocModel> entities);
    
}
