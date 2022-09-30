package com.ohj.uml.generalization;

import java.nio.channels.Pipe;

public class Generalization {
}

abstract class DaoSupport{
    public void save(Object entity){}
    public void delete(Object id){}
}

class PersonServiceBean extends DaoSupport{ }