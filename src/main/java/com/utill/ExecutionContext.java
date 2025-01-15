package com.utill;

public class ExecutionContext {
	 private static final ThreadLocal<Boolean> isParallel = ThreadLocal.withInitial(() -> true);

	    public static void setParallel(boolean parallel) {
	        isParallel.set(parallel);
	    }

	    public static boolean isParallel() {
	        return isParallel.get();
	    }

	    public static void clear() {
	        isParallel.remove();
	    }

}
