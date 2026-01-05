package com.amplifyframework.api.aws;

import com.amplifyframework.api.aws.MultiAuthModeStrategy;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.AuthRule;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.auth.AuthorizationTypeIterator;
import com.amplifyframework.core.model.auth.MultiAuthorizationTypeIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class MultiAuthModeStrategy implements AuthModeStrategy {
    private static MultiAuthModeStrategy instance;

    private MultiAuthModeStrategy() {
    }

    public static synchronized MultiAuthModeStrategy getInstance() {
        if (instance == null) {
            instance = new MultiAuthModeStrategy();
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$authTypesFor$0(ModelOperation modelOperation, List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AuthRule authRule = (AuthRule) it.next();
            if (authRule.getOperationsOrDefault().contains(modelOperation)) {
                list.add(authRule);
            }
        }
    }

    @Override // com.amplifyframework.api.aws.AuthModeStrategy
    public AuthorizationTypeIterator authTypesFor(ModelSchema modelSchema, final ModelOperation modelOperation) {
        final ArrayList arrayList = new ArrayList();
        Consumer consumer = new Consumer() { // from class: o.onb
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                MultiAuthModeStrategy.lambda$authTypesFor$0(modelOperation, arrayList, (List) obj);
            }
        };
        consumer.accept(modelSchema.getAuthRules());
        Iterator<ModelField> it = modelSchema.getFields().values().iterator();
        while (it.hasNext()) {
            consumer.accept(it.next().getAuthRules());
        }
        return new MultiAuthorizationTypeIterator(arrayList);
    }
}
