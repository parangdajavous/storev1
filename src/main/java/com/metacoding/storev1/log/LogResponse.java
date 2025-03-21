package com.metacoding.storev1.log;

import lombok.Data;

// DTO : Data Transfer Object -> 화면에 필요한 데이터만 있는 object
public class LogResponse {

    @Data // getter,setter,toString 다 들고 있음
    public static class ListPage {
        private int id;
        private String name;
        private int qty;
        private int totalPrice;
        private String buyer;

        // 생성자
        public ListPage(int id, String name, int qty, int totalPrice, String buyer) {
            this.id = id;
            this.name = name;
            this.qty = qty;
            this.totalPrice = totalPrice;
            this.buyer = buyer;
        }

        // @Override
        // public String toString() {
        // return "ListPage{" +
        // "id=" + id +
        // ", name='" + name + '\'' +
        // ", qty=" + qty +
        // ", totalPrice=" + totalPrice +
        // ", buyer='" + buyer + '\'' +
        // '}';
        // }

    }

}
