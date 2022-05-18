/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.WebsiteTinTucTheThao.service;

import com.example.WebsiteTinTucTheThao.model.TheLoaiModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dovan
 */
public interface TheLoaiService {

    long count();

    void delete(TheLoaiModel entity);

    void deleteAll();

    void deleteAll(List<TheLoaiModel> entities);

    void deleteAllById(List<Integer> ids);

    void deleteById(Integer id);

    boolean existsById(Integer id);

    List<TheLoaiModel> findAll();

    List<TheLoaiModel> findAllById(List<Integer> ids);

    Optional<TheLoaiModel> findById(Integer id);

    TheLoaiModel save(TheLoaiModel entity);

    List<TheLoaiModel> saveAll(List<TheLoaiModel> entities);
    
}
