package org.n3r.idworker.strategy;

public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
