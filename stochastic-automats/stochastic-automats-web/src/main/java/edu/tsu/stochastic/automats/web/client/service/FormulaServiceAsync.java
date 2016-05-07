package edu.tsu.stochastic.automats.web.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import edu.tsu.stochastic.automats.web.shared.UzFormulaParamModel;
import edu.tsu.stochastic.automats.web.shared.UzFormulaResultModel;
import edu.tsu.stochastic.automats.web.shared.WnFormulaParamModel;
import edu.tsu.stochastic.automats.web.shared.WnFormulaResultModel;

import java.util.List;

public interface FormulaServiceAsync {
    void calculateUzFormula(UzFormulaParamModel uzFormulaParamModel, AsyncCallback<UzFormulaResultModel> async);

    void calculateWnFormula(WnFormulaParamModel wnFormulaParamModel, int maxN, AsyncCallback<WnFormulaResultModel> async);
}