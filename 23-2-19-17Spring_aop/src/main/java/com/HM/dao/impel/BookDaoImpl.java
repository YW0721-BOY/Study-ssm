package com.HM.dao.impel;

import com.HM.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao is save……");
    }

    public void update(){
        System.out.println("book is update……");
    }
    public void delete(){
        System.out.println("book is delete……");
    }
    public void select(){
        System.out.println("book is select……");
    }

}
