package com.onesignal.common.modeling;

import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.preferences.IPreferencesService;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes6.dex */
public class SimpleModelStore<TModel extends Model> extends ModelStore<TModel> {
    private final uk7 _create;

    public /* synthetic */ SimpleModelStore(uk7 uk7Var, String str, IPreferencesService iPreferencesService, int i, id5 id5Var) {
        this(uk7Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : iPreferencesService);
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public TModel create(JSONObject jSONObject) {
        TModel tmodel = (TModel) this._create.invoke();
        if (jSONObject != null) {
            tmodel.initializeFromJson(jSONObject);
        }
        return tmodel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleModelStore(uk7 uk7Var, String str, IPreferencesService iPreferencesService) {
        super(str, iPreferencesService);
        sq8.m48649h(uk7Var, "_create");
        this._create = uk7Var;
        load();
    }
}
