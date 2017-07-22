package com.punyabagus.app.logic;

import com.punyabagus.app.dao.BasicDAO;

import javax.inject.Inject;

/**
 * Created by prasojo on 7/22/17.
 */
public class BasicLogic {
    public BasicDAO basicDAO;

    @Inject
    public BasicLogic(BasicDAO basicDAO) {
        this.basicDAO = basicDAO;
    }

    public String getString() {
        return basicDAO.getString();
    }
}
