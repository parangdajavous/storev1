package com.metacoding.storev1.store;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StoreService {

    private StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Transactional
    public void 상품등록(String name, int stock, int price) {
        storeRepository.save(name, stock, price);

    }

    public List<Store> 상품목록() {
        List<Store> storeList = storeRepository.findAll();
        return storeList;
    }

    public Store 상세보기(int id) {
        Store store = storeRepository.findbyId(id);
        return store;
    }

    // 3
    @Transactional // insert, delete, update 시에 사용: 함수 종료 시 commit 됨
    public void 상품삭제(int id) {
        // 상품 있는지 확인
        Store store = storeRepository.findbyId(id);

        // 있으면 삭제
        if (store == null) {
            throw new RuntimeException("상품 없는데 왜 삭제?");
        }
        storeRepository.deleteById(id);

    }

}
