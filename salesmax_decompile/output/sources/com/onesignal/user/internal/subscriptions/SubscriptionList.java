package com.onesignal.user.internal.subscriptions;

import com.onesignal.user.subscriptions.IEmailSubscription;
import com.onesignal.user.subscriptions.IPushSubscription;
import com.onesignal.user.subscriptions.ISmsSubscription;
import com.onesignal.user.subscriptions.ISubscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class SubscriptionList {
    private final IPushSubscription _fallbackPushSub;
    private final List<ISubscription> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionList(List<? extends ISubscription> list, IPushSubscription iPushSubscription) {
        sq8.m48649h(list, "collection");
        sq8.m48649h(iPushSubscription, "_fallbackPushSub");
        this.collection = list;
        this._fallbackPushSub = iPushSubscription;
    }

    public final IEmailSubscription getByEmail(String str) {
        Object next;
        sq8.m48649h(str, "email");
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (sq8.m48644c(((IEmailSubscription) next).getEmail(), str)) {
                break;
            }
        }
        return (IEmailSubscription) next;
    }

    public final ISmsSubscription getBySMS(String str) {
        Object next;
        sq8.m48649h(str, "sms");
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (sq8.m48644c(((ISmsSubscription) next).getNumber(), str)) {
                break;
            }
        }
        return (ISmsSubscription) next;
    }

    public final List<ISubscription> getCollection() {
        return this.collection;
    }

    public final List<IEmailSubscription> getEmails() {
        List<ISubscription> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof IEmailSubscription) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final IPushSubscription getPush() {
        List<ISubscription> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof IPushSubscription) {
                arrayList.add(obj);
            }
        }
        IPushSubscription iPushSubscription = (IPushSubscription) kh3.h0(arrayList);
        return iPushSubscription == null ? this._fallbackPushSub : iPushSubscription;
    }

    public final List<ISmsSubscription> getSmss() {
        List<ISubscription> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ISmsSubscription) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
