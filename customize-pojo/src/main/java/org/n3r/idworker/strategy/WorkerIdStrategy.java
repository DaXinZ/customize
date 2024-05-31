package org.n3r.idworker.strategy;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
