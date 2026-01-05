package com.amplifyframework.kotlin.geo;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.geo.GeoCategoryBehavior;
import com.amplifyframework.geo.GeoException;
import com.amplifyframework.geo.models.MapStyle;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinGeoFacade implements Geo {
    private final GeoCategoryBehavior delegate;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.geo.KotlinGeoFacade", m15344f = "KotlinGeoFacade.kt", m15345l = {37}, m15346m = "getDefaultMap")
    /* renamed from: com.amplifyframework.kotlin.geo.KotlinGeoFacade$getDefaultMap$1 */
    public static final class C12091 extends AbstractC8193c {
        int label;
        /* synthetic */ Object result;

        public C12091(InterfaceC7559c<? super C12091> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinGeoFacade.this.getDefaultMap(this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.geo.KotlinGeoFacade", m15344f = "KotlinGeoFacade.kt", m15345l = {45}, m15346m = "getMapStyleDescriptor")
    /* renamed from: com.amplifyframework.kotlin.geo.KotlinGeoFacade$getMapStyleDescriptor$1 */
    public static final class C12101 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12101(InterfaceC7559c<? super C12101> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinGeoFacade.this.getMapStyleDescriptor(null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.geo.KotlinGeoFacade", m15344f = "KotlinGeoFacade.kt", m15345l = {64}, m15346m = "searchByCoordinates")
    /* renamed from: com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByCoordinates$1 */
    public static final class C12111 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12111(InterfaceC7559c<? super C12111> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinGeoFacade.this.searchByCoordinates(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.geo.KotlinGeoFacade", m15344f = "KotlinGeoFacade.kt", m15345l = {54}, m15346m = "searchByText")
    /* renamed from: com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByText$1 */
    public static final class C12121 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12121(InterfaceC7559c<? super C12121> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinGeoFacade.this.searchByText(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinGeoFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.amplifyframework.kotlin.geo.Geo
    public Object getAvailableMaps(InterfaceC7559c<? super Collection<MapStyle>> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.getAvailableMaps(new Consumer() { // from class: com.amplifyframework.kotlin.geo.KotlinGeoFacade$getAvailableMaps$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Collection<MapStyle> it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.geo.KotlinGeoFacade$getAvailableMaps$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(GeoException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.kotlin.geo.Geo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getDefaultMap(uw.InterfaceC7559c<? super com.amplifyframework.geo.models.MapStyle> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amplifyframework.kotlin.geo.KotlinGeoFacade.C12091
            if (r0 == 0) goto L13
            r0 = r5
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$getDefaultMap$1 r0 = (com.amplifyframework.kotlin.geo.KotlinGeoFacade.C12091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$getDefaultMap$1 r0 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$getDefaultMap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L53
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.label = r3
            uw.j r5 = new uw.j
            uw.c r0 = pg.n6.m11797c(r0)
            r5.<init>(r0)
            com.amplifyframework.geo.GeoCategoryBehavior r0 = r4.delegate
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$getDefaultMap$2$1 r2 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$getDefaultMap$2$1
            r2.<init>()
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$getDefaultMap$2$2 r3 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$getDefaultMap$2$2
            r3.<init>()
            r0.getDefaultMap(r2, r3)
            java.lang.Object r5 = r5.m14303a()
            if (r5 != r1) goto L53
            return r1
        L53:
            java.lang.String r0 = "suspendCoroutine(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.geo.KotlinGeoFacade.getDefaultMap(uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.kotlin.geo.Geo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getMapStyleDescriptor(com.amplifyframework.geo.options.GetMapStyleDescriptorOptions r5, uw.InterfaceC7559c<? super com.amplifyframework.geo.models.MapStyleDescriptor> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amplifyframework.kotlin.geo.KotlinGeoFacade.C12101
            if (r0 == 0) goto L13
            r0 = r6
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$getMapStyleDescriptor$1 r0 = (com.amplifyframework.kotlin.geo.KotlinGeoFacade.C12101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$getMapStyleDescriptor$1 r0 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$getMapStyleDescriptor$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.amplifyframework.geo.options.GetMapStyleDescriptorOptions r5 = (com.amplifyframework.geo.options.GetMapStyleDescriptorOptions) r5
            og.od.m10798c(r6)
            goto L59
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r6)
            r0.L$0 = r5
            r0.label = r3
            uw.j r6 = new uw.j
            uw.c r0 = pg.n6.m11797c(r0)
            r6.<init>(r0)
            com.amplifyframework.geo.GeoCategoryBehavior r0 = r4.delegate
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$getMapStyleDescriptor$2$1 r2 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$getMapStyleDescriptor$2$1
            r2.<init>()
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$getMapStyleDescriptor$2$2 r3 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$getMapStyleDescriptor$2$2
            r3.<init>()
            r0.getMapStyleDescriptor(r5, r2, r3)
            java.lang.Object r6 = r6.m14303a()
            if (r6 != r1) goto L59
            return r1
        L59:
            java.lang.String r5 = "suspendCoroutine(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.geo.KotlinGeoFacade.getMapStyleDescriptor(com.amplifyframework.geo.options.GetMapStyleDescriptorOptions, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.kotlin.geo.Geo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object searchByCoordinates(com.amplifyframework.geo.models.Coordinates r5, com.amplifyframework.geo.options.GeoSearchByCoordinatesOptions r6, uw.InterfaceC7559c<? super com.amplifyframework.geo.result.GeoSearchResult> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amplifyframework.kotlin.geo.KotlinGeoFacade.C12111
            if (r0 == 0) goto L13
            r0 = r7
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByCoordinates$1 r0 = (com.amplifyframework.kotlin.geo.KotlinGeoFacade.C12111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByCoordinates$1 r0 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByCoordinates$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$1
            com.amplifyframework.geo.options.GeoSearchByCoordinatesOptions r5 = (com.amplifyframework.geo.options.GeoSearchByCoordinatesOptions) r5
            java.lang.Object r5 = r0.L$0
            com.amplifyframework.geo.models.Coordinates r5 = (com.amplifyframework.geo.models.Coordinates) r5
            og.od.m10798c(r7)
            goto L5f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            og.od.m10798c(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            uw.j r7 = new uw.j
            uw.c r0 = pg.n6.m11797c(r0)
            r7.<init>(r0)
            com.amplifyframework.geo.GeoCategoryBehavior r0 = r4.delegate
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByCoordinates$2$1 r2 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByCoordinates$2$1
            r2.<init>()
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByCoordinates$2$2 r3 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByCoordinates$2$2
            r3.<init>()
            r0.searchByCoordinates(r5, r6, r2, r3)
            java.lang.Object r7 = r7.m14303a()
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r5 = "suspendCoroutine(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.geo.KotlinGeoFacade.searchByCoordinates(com.amplifyframework.geo.models.Coordinates, com.amplifyframework.geo.options.GeoSearchByCoordinatesOptions, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.kotlin.geo.Geo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object searchByText(java.lang.String r5, com.amplifyframework.geo.options.GeoSearchByTextOptions r6, uw.InterfaceC7559c<? super com.amplifyframework.geo.result.GeoSearchResult> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amplifyframework.kotlin.geo.KotlinGeoFacade.C12121
            if (r0 == 0) goto L13
            r0 = r7
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByText$1 r0 = (com.amplifyframework.kotlin.geo.KotlinGeoFacade.C12121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByText$1 r0 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByText$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$1
            com.amplifyframework.geo.options.GeoSearchByTextOptions r5 = (com.amplifyframework.geo.options.GeoSearchByTextOptions) r5
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            og.od.m10798c(r7)
            goto L5f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            og.od.m10798c(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            uw.j r7 = new uw.j
            uw.c r0 = pg.n6.m11797c(r0)
            r7.<init>(r0)
            com.amplifyframework.geo.GeoCategoryBehavior r0 = r4.delegate
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByText$2$1 r2 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByText$2$1
            r2.<init>()
            com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByText$2$2 r3 = new com.amplifyframework.kotlin.geo.KotlinGeoFacade$searchByText$2$2
            r3.<init>()
            r0.searchByText(r5, r6, r2, r3)
            java.lang.Object r7 = r7.m14303a()
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r5 = "suspendCoroutine(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.geo.KotlinGeoFacade.searchByText(java.lang.String, com.amplifyframework.geo.options.GeoSearchByTextOptions, uw.c):java.lang.Object");
    }

    public KotlinGeoFacade(GeoCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KotlinGeoFacade(GeoCategoryBehavior Geo, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            Geo = Amplify.Geo;
            AbstractC4154l.m8922e(Geo, "Geo");
        }
        this(Geo);
    }
}
