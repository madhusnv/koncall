package com.sun.mail.handlers;

import nw.C5151a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class text_html extends text_plain {
    private static C5151a[] myDF = {new C5151a(String.class, "text/html")};

    @Override // com.sun.mail.handlers.text_plain, com.sun.mail.handlers.handler_base
    public C5151a[] getDataFlavors() {
        return myDF;
    }
}
