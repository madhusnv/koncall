package com.onesignal.inAppMessages.internal;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.inAppMessages.IInAppMessage;
import com.onesignal.inAppMessages.IInAppMessageClickEvent;
import com.onesignal.inAppMessages.IInAppMessageClickResult;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppMessageClickEvent implements IInAppMessageClickEvent {
    private final InAppMessage _message;
    private final InAppMessageClickResult _result;

    public InAppMessageClickEvent(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult) {
        sq8.m48649h(inAppMessage, "msg");
        sq8.m48649h(inAppMessageClickResult, "actn");
        this._message = inAppMessage;
        this._result = inAppMessageClickResult;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickEvent
    public IInAppMessage getMessage() {
        return this._message;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickEvent
    public IInAppMessageClickResult getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, this._message.toJSONObject()).put("action", this._result.toJSONObject());
        sq8.m48648g(jSONObjectPut, "JSONObject()\n           …, _result.toJSONObject())");
        return jSONObjectPut;
    }
}
