package ky;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.j */
/* loaded from: classes3.dex */
public final class C4278j {

    /* renamed from: a */
    public final boolean f21681a;

    /* renamed from: b */
    public final boolean f21682b;

    /* renamed from: c */
    public final String f21683c;

    /* renamed from: d */
    public final String f21684d;

    /* renamed from: e */
    public final boolean f21685e;

    /* renamed from: f */
    public final C4289u f21686f;

    /* renamed from: g */
    public final EnumC4269a f21687g;

    public C4278j(boolean z6, boolean z10, String prettyPrintIndent, String classDiscriminator, boolean z11, C4289u c4289u, EnumC4269a classDiscriminatorMode) {
        AbstractC4154l.m8923f(prettyPrintIndent, "prettyPrintIndent");
        AbstractC4154l.m8923f(classDiscriminator, "classDiscriminator");
        AbstractC4154l.m8923f(classDiscriminatorMode, "classDiscriminatorMode");
        this.f21681a = z6;
        this.f21682b = z10;
        this.f21683c = prettyPrintIndent;
        this.f21684d = classDiscriminator;
        this.f21685e = z11;
        this.f21686f = c4289u;
        this.f21687g = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f21681a + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f21682b + ", prettyPrintIndent='" + this.f21683c + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f21684d + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f21685e + ", namingStrategy=" + this.f21686f + ", decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f21687g + ')';
    }
}
