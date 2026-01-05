package im;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    private final int code;
    public static final i0 Unknown = new i0("Unknown", 0, -1);
    public static final i0 BadRequest = new i0("BadRequest", 1, 400);
    public static final i0 Unauthorized = new i0("Unauthorized", 2, 401);
    public static final i0 PaymentRequired = new i0("PaymentRequired", 3, 402);
    public static final i0 Forbidden = new i0("Forbidden", 4, 403);
    public static final i0 NotFound = new i0("NotFound", 5, 404);
    public static final i0 MethodNotAllowed = new i0("MethodNotAllowed", 6, 405);
    public static final i0 NotAcceptable = new i0("NotAcceptable", 7, 406);
    public static final i0 ProxyAuthenticationRequired = new i0("ProxyAuthenticationRequired", 8, 407);
    public static final i0 RequestTimeout = new i0("RequestTimeout", 9, 408);
    public static final i0 Conflict = new i0("Conflict", 10, 409);
    public static final i0 Gone = new i0("Gone", 11, 410);
    public static final i0 LengthRequired = new i0("LengthRequired", 12, 411);
    public static final i0 PreconditionFailed = new i0("PreconditionFailed", 13, 412);
    public static final i0 PayloadTooLarge = new i0("PayloadTooLarge", 14, 413);
    public static final i0 UriTooLong = new i0("UriTooLong", 15, 414);
    public static final i0 UnsupportedMediaType = new i0("UnsupportedMediaType", 16, 415);
    public static final i0 RangeNotSatisfiable = new i0("RangeNotSatisfiable", 17, DilithiumEngine.DilithiumPolyT0PackedBytes);
    public static final i0 ExpectationFailed = new i0("ExpectationFailed", 18, 417);
    public static final i0 ImATeapot = new i0("ImATeapot", 19, 418);
    public static final i0 MisdirectedRequest = new i0("MisdirectedRequest", 20, 421);
    public static final i0 UnprocessableEntity = new i0("UnprocessableEntity", 21, 422);
    public static final i0 Locked = new i0("Locked", 22, 423);
    public static final i0 FailedDependency = new i0("FailedDependency", 23, 424);
    public static final i0 UpgradeRequired = new i0("UpgradeRequired", 24, 426);
    public static final i0 PreconditionRequired = new i0("PreconditionRequired", 25, 428);
    public static final i0 TooManyRequests = new i0("TooManyRequests", 26, 429);
    public static final i0 RequestHeaderFieldsTooLarge = new i0("RequestHeaderFieldsTooLarge", 27, 431);
    public static final i0 UnavailableForLegalReasons = new i0("UnavailableForLegalReasons", 28, 451);
    public static final i0 InternalServerError = new i0("InternalServerError", 29, 500);
    public static final i0 NotImplemented = new i0("NotImplemented", 30, 501);
    public static final i0 BadGateway = new i0("BadGateway", 31, 502);
    public static final i0 ServiceUnavailable = new i0("ServiceUnavailable", 32, 503);
    public static final i0 GatewayTimeout = new i0("GatewayTimeout", 33, 504);
    public static final i0 HttpVersionNotSupported = new i0("HttpVersionNotSupported", 34, 505);
    public static final i0 VariantAlsoNegates = new i0("VariantAlsoNegates", 35, 506);
    public static final i0 InsufficientStorage = new i0("InsufficientStorage", 36, 507);
    public static final i0 LoopDetected = new i0("LoopDetected", 37, 508);
    public static final i0 NotExtended = new i0("NotExtended", 38, 510);
    public static final i0 NetworkAuthenticationRequired = new i0("NetworkAuthenticationRequired", 39, 511);

    private static final /* synthetic */ i0[] $values() {
        return new i0[]{Unknown, BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, MethodNotAllowed, NotAcceptable, ProxyAuthenticationRequired, RequestTimeout, Conflict, Gone, LengthRequired, PreconditionFailed, PayloadTooLarge, UriTooLong, UnsupportedMediaType, RangeNotSatisfiable, ExpectationFailed, ImATeapot, MisdirectedRequest, UnprocessableEntity, Locked, FailedDependency, UpgradeRequired, PreconditionRequired, TooManyRequests, RequestHeaderFieldsTooLarge, UnavailableForLegalReasons, InternalServerError, NotImplemented, BadGateway, ServiceUnavailable, GatewayTimeout, HttpVersionNotSupported, VariantAlsoNegates, InsufficientStorage, LoopDetected, NotExtended, NetworkAuthenticationRequired};
    }

    static {
        i0[] i0VarArr$values = $values();
        $VALUES = i0VarArr$values;
        $ENTRIES = b8.m11548b(i0VarArr$values);
    }

    private i0(String str, int i10, int i11) {
        this.code = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
