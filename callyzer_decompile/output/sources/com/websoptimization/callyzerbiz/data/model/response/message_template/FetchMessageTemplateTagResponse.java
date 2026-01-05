package com.websoptimization.callyzerbiz.data.model.response.message_template;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchMessageTemplateTagResponse {

    @InterfaceC4485b("tags")
    private List<String> tags;

    public FetchMessageTemplateTagResponse(List<String> tags) {
        AbstractC4154l.m8923f(tags, "tags");
        this.tags = tags;
    }

    /* renamed from: a */
    public final List m4986a() {
        return this.tags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchMessageTemplateTagResponse) && AbstractC4154l.m8918a(this.tags, ((FetchMessageTemplateTagResponse) obj).tags);
    }

    public final int hashCode() {
        return this.tags.hashCode();
    }

    public final String toString() {
        return m0.m7380m("FetchMessageTemplateTagResponse(tags=", ")", this.tags);
    }
}
