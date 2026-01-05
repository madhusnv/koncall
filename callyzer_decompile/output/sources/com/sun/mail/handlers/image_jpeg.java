package com.sun.mail.handlers;

import java.awt.Image;
import nw.C5151a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class image_jpeg extends image_gif {
    private static C5151a[] myDF = {new C5151a(Image.class, "image/jpeg")};

    @Override // com.sun.mail.handlers.image_gif, com.sun.mail.handlers.handler_base
    public C5151a[] getDataFlavors() {
        return myDF;
    }
}
