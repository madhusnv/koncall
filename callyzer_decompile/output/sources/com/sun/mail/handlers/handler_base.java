package com.sun.mail.handlers;

import java.io.OutputStream;
import nw.C5151a;
import nw.InterfaceC5153c;
import nw.InterfaceC5156f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class handler_base implements InterfaceC5153c {
    @Override // nw.InterfaceC5153c
    public abstract /* synthetic */ Object getContent(InterfaceC5156f interfaceC5156f);

    public Object getData(C5151a c5151a, InterfaceC5156f interfaceC5156f) {
        return getContent(interfaceC5156f);
    }

    public abstract C5151a[] getDataFlavors();

    public Object getTransferData(C5151a c5151a, InterfaceC5156f interfaceC5156f) {
        C5151a[] dataFlavors = getDataFlavors();
        for (int i10 = 0; i10 < dataFlavors.length; i10++) {
            if (dataFlavors[i10].m10059a(c5151a)) {
                return getData(dataFlavors[i10], interfaceC5156f);
            }
        }
        return null;
    }

    public C5151a[] getTransferDataFlavors() {
        C5151a[] dataFlavors = getDataFlavors();
        if (dataFlavors.length == 1) {
            return new C5151a[]{dataFlavors[0]};
        }
        C5151a[] c5151aArr = new C5151a[dataFlavors.length];
        System.arraycopy(dataFlavors, 0, c5151aArr, 0, dataFlavors.length);
        return c5151aArr;
    }

    @Override // nw.InterfaceC5153c
    public abstract /* synthetic */ void writeTo(Object obj, String str, OutputStream outputStream);
}
