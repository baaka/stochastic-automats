package edu.tsu.stochastic.automats.web.client;

import com.google.gwt.event.shared.HandlerManager;
import edu.tsu.stochastic.automats.web.client.error.ErrorHandler;
import edu.tsu.stochastic.automats.web.client.error.ErrorHandlerImpl;
import edu.tsu.stochastic.automats.web.client.presenter.AppFramePresenter;
import edu.tsu.stochastic.automats.web.client.presenter.UzFormulaPresenter;
import edu.tsu.stochastic.automats.web.client.presenter.WnFormulaPresenter;
import edu.tsu.stochastic.automats.web.client.view.AppFrameView;
import edu.tsu.stochastic.automats.web.client.view.UzFormulaView;
import edu.tsu.stochastic.automats.web.client.view.WnFormulaView;

public class ClientFactoryImpl implements ClientFactory {
    private final HandlerManager eventBus = new HandlerManager(null);
    private final ErrorHandler errorHandler = new ErrorHandlerImpl();

    public ClientFactoryImpl() {
    }

    @Override
    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    @Override
    public HandlerManager getEventBus() {
        return eventBus;
    }

    @Override
    public AppFramePresenter.Display getAppFrameDisplay() {
        return new AppFrameView();
    }

    @Override
    public UzFormulaPresenter.Display getUzFormulaDisplay() {
        return new UzFormulaView();
    }

    @Override
    public WnFormulaPresenter.Display getWnFormulaDisplay() {
        return new WnFormulaView();
    }
}