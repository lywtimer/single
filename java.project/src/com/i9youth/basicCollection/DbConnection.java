package com.i9youth.basicCollection;

public interface DbConnection<T> {
    T connect();
}


class MySQLConnection implements DbConnection<String> {

    @Override
    public String connect() {
        return null;
    }
}

class MongoConnection implements DbConnection<Integer> {
    @Override
    public Integer connect() {
        return null;
    }
}