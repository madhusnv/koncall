package com.onesignal.common.consistency;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.ICondition;
import com.onesignal.common.consistency.models.IConsistencyKeyEnum;
import java.util.Iterator;
import java.util.Map;
import p001o.ch3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class IamFetchReadyCondition implements ICondition {
    public static final Companion Companion = new Companion(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public IamFetchReadyCondition(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.key = str;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public String getId() {
        return ID;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public RywData getRywData(Map<String, ? extends Map<IConsistencyKeyEnum, RywData>> map) {
        sq8.m48649h(map, "indexedTokens");
        Map<IConsistencyKeyEnum, RywData> map2 = map.get(this.key);
        Object next = null;
        if (map2 == null) {
            return null;
        }
        Iterator it = ch3.m21251p(map2.get(IamFetchRywTokenKey.USER), map2.get(IamFetchRywTokenKey.SUBSCRIPTION)).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String rywToken = ((RywData) next).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next2 = it.next();
                    String rywToken2 = ((RywData) next2).getRywToken();
                    if (rywToken2 == null) {
                        rywToken2 = "";
                    }
                    if (rywToken.compareTo(rywToken2) < 0) {
                        next = next2;
                        rywToken = rywToken2;
                    }
                } while (it.hasNext());
            }
        }
        return (RywData) next;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public boolean isMet(Map<String, ? extends Map<IConsistencyKeyEnum, RywData>> map) {
        sq8.m48649h(map, "indexedTokens");
        Map<IConsistencyKeyEnum, RywData> map2 = map.get(this.key);
        return (map2 == null || map2.get(IamFetchRywTokenKey.USER) == null) ? false : true;
    }
}
