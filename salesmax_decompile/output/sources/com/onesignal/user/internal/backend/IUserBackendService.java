package com.onesignal.user.internal.backend;

import java.util.List;
import java.util.Map;
import p001o.n64;

/* loaded from: classes6.dex */
public interface IUserBackendService {
    Object createUser(String str, Map<String, String> map, List<SubscriptionObject> list, Map<String, String> map2, n64 n64Var);

    Object getUser(String str, String str2, String str3, n64 n64Var);

    Object updateUser(String str, String str2, String str3, PropertiesObject propertiesObject, boolean z, PropertiesDeltasObject propertiesDeltasObject, n64 n64Var);
}
