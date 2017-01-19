package com.gigigo.interactorexecutor.domain.interactors;

import java.util.concurrent.Callable;

public interface Interactor<T extends InteractorResponse> extends Callable<T> {
  @Override T call() throws Exception;
}
