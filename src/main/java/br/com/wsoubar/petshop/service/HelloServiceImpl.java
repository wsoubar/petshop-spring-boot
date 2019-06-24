package br.com.wsoubar.petshop.service;

import org.springframework.stereotype.Service;

import br.com.wsoubar.petshop.vo.HelloVO;

/**
 * HelloServiceImpl
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public HelloVO getHello(String nome, int idade) {
        HelloVO vo = new HelloVO();
        vo.setNome(nome);
        vo.setIdade(idade);
        return vo;
    }

    
}