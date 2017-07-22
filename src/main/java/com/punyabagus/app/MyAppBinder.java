package com.punyabagus.app;

import com.punyabagus.app.dao.BasicDAO;
import com.punyabagus.app.dao.BasicDAOImplement;
import com.punyabagus.app.logic.BasicLogic;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * Created by prasojo on 7/22/17.
 */
public class MyAppBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(BasicDAOImplement.class).to(BasicDAO.class);
        bind(BasicLogic.class).to(BasicLogic.class);
    }
}
