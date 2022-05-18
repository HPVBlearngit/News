/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.WebsiteTinTucTheThao.service;

import com.example.WebsiteTinTucTheThao.model.TaiKhoanModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dovan
 */
public interface TaiKhoanService {

    long count();

    void delete(TaiKhoanModel entity);

    void deleteAll();

    void deleteAll(List<TaiKhoanModel> entities);

    void deleteAllById(List<Integer> ids);

    void deleteById(Integer id);

    boolean existsById(Integer id);

    List<TaiKhoanModel> findAll();

    List<TaiKhoanModel> findAllById(List<Integer> ids);

    Optional<TaiKhoanModel> findById(Integer id);

    TaiKhoanModel save(TaiKhoanModel entity);

    List<TaiKhoanModel> saveAll(List<TaiKhoanModel> entities);

    TaiKhoanModel getTaiKhoanTheoTenDangNhap(String tenDangNhap);
    
}
