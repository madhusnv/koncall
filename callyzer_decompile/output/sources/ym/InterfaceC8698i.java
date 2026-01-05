package ym;

import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import com.websoptimization.callyzerbiz.data.model.response.OnAppUpdatedResponse;
import i00.p0;
import im.f1;
import k00.InterfaceC3903c;
import k00.InterfaceC3905e;
import k00.InterfaceC3907g;
import k00.InterfaceC3915o;
import k00.InterfaceC3925y;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.i */
/* loaded from: classes3.dex */
public interface InterfaceC8698i {
    @InterfaceC3905e
    @InterfaceC3915o("appVersion/update")
    /* renamed from: a */
    Object m16095a(@InterfaceC3903c("companyCode") String str, @InterfaceC3903c("uniqueSimId") String str2, @InterfaceC3903c("appVersion") String str3, @InterfaceC3903c("mobile") String str4, @InterfaceC3903c("versionCode") int i10, InterfaceC7559c<? super f1<BaseResponse<OnAppUpdatedResponse>>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("app/update/isForcefully")
    /* renamed from: b */
    Object m16096b(@InterfaceC3903c("installedAppVersion") String str, InterfaceC7559c<? super f1<BaseResponse<Boolean>>> interfaceC7559c);

    @InterfaceC3907g
    /* renamed from: c */
    Object m16097c(@InterfaceC3925y String str, InterfaceC7559c<? super p0<Void>> interfaceC7559c);

    @InterfaceC3905e
    @InterfaceC3915o("isValidCompanyCode")
    /* renamed from: d */
    Object m16098d(@InterfaceC3903c("companyCode") String str, InterfaceC7559c<? super f1<BaseResponse<Boolean>>> interfaceC7559c);
}
