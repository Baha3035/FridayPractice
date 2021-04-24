package kg.megacom.dbHelper;

import kg.megacom.dbHelper.impl.DbHelperImpl;
import kg.megacom.models.Accounts;

public interface DbHelper {
    DbHelper INSTANCE =new DbHelperImpl();

    Accounts findByLogin(String login);
}