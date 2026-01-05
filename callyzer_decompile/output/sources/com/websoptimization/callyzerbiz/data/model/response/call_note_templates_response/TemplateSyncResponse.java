package com.websoptimization.callyzerbiz.data.model.response.call_note_templates_response;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class TemplateSyncResponse {

    @InterfaceC4485b("appNoteTemplateId")
    private final String appNoteTemplateId;

    @InterfaceC4485b("isSync")
    private final boolean isSync;

    @InterfaceC4485b("noteTemplateId")
    private final String noteTemplateId;

    public TemplateSyncResponse(String noteTemplateId, String appNoteTemplateId, boolean z6) {
        AbstractC4154l.m8923f(noteTemplateId, "noteTemplateId");
        AbstractC4154l.m8923f(appNoteTemplateId, "appNoteTemplateId");
        this.noteTemplateId = noteTemplateId;
        this.appNoteTemplateId = appNoteTemplateId;
        this.isSync = z6;
    }

    /* renamed from: a */
    public final String m4856a() {
        return this.appNoteTemplateId;
    }

    /* renamed from: b */
    public final String m4857b() {
        return this.noteTemplateId;
    }

    /* renamed from: c */
    public final boolean m4858c() {
        return this.isSync;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateSyncResponse)) {
            return false;
        }
        TemplateSyncResponse templateSyncResponse = (TemplateSyncResponse) obj;
        return AbstractC4154l.m8918a(this.noteTemplateId, templateSyncResponse.noteTemplateId) && AbstractC4154l.m8918a(this.appNoteTemplateId, templateSyncResponse.appNoteTemplateId) && this.isSync == templateSyncResponse.isSync;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSync) + AbstractC0030c.m113d(this.noteTemplateId.hashCode() * 31, 31, this.appNoteTemplateId);
    }

    public final String toString() {
        String str = this.noteTemplateId;
        String str2 = this.appNoteTemplateId;
        return AbstractC5601a.m11242m(AbstractC0030c.m127r("TemplateSyncResponse(noteTemplateId=", str, ", appNoteTemplateId=", str2, ", isSync="), this.isSync, ")");
    }
}
