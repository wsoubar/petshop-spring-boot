package br.com.wsoubar.petshop.service;

import br.com.wsoubar.petshop.vo.HelloVO;

/**
 * HelloService
 */
public interface HelloService {

    public HelloVO getHello(String nome, int idade);
    
}