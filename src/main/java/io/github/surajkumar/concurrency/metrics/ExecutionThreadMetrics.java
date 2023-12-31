package io.github.surajkumar.concurrency.metrics;

import java.util.concurrent.atomic.AtomicLong;

/**
 * The ExecutionThreadMetrics class represents the metrics of an execution thread. It keeps track of
 * the total number of promises, completed promises, and failed promises.
 */
public class ExecutionThreadMetrics {
    private final AtomicLong totalPromises = new AtomicLong();
    private final AtomicLong completedPromises = new AtomicLong();
    private final AtomicLong failedPromises = new AtomicLong();

    /**
     * The ExecutionThreadMetrics class represents the metrics of an execution thread. It keeps
     * track of the total number of promises, completed promises, and failed promises.
     */
    public ExecutionThreadMetrics() {}

    /**
     * Retrieves the total number of promises tracked by the ExecutionThreadMetrics object.
     *
     * @return The total number of promises as a long value.
     */
    public long getTotalPromises() {
        return totalPromises.get();
    }

    /**
     * Increments the total number of promises tracked by the ExecutionThreadMetrics object by one.
     */
    public void incrementTotalPromises() {
        totalPromises.incrementAndGet();
    }

    /**
     * Retrieves the total number of completed promises tracked by the ExecutionThreadMetrics
     * object.
     *
     * @return The total number of completed promises as a long value.
     */
    public long getCompletedPromises() {
        return completedPromises.get();
    }

    /**
     * Increments the total number of completed promises in the ExecutionThreadMetrics object by
     * one.
     */
    public void incrementCompletedPromises() {
        completedPromises.incrementAndGet();
    }

    /**
     * Increments the total number of failed promises in the ExecutionThreadMetrics object by one.
     * This method should be called whenever a promise fails in the execution thread.
     */
    public void incrementFailedPromises() {
        failedPromises.incrementAndGet();
    }

    @Override
    public String toString() {
        return "ExecutionThreadMetrics{"
                + "totalPromises="
                + totalPromises
                + ", completedPromises="
                + completedPromises
                + ", failedPromises="
                + failedPromises
                + '}';
    }
}
