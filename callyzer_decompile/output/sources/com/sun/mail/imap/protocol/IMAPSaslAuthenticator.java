package com.sun.mail.imap.protocol;

import com.sun.mail.auth.OAuth2SaslClientFactory;
import com.sun.mail.util.MailLogger;
import java.util.Properties;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPSaslAuthenticator implements SaslAuthenticator {

    /* renamed from: a */
    public static final /* synthetic */ int f7246a = 0;
    private String host;
    private MailLogger logger;
    private String name;

    /* renamed from: pr, reason: collision with root package name */
    private IMAPProtocol f43923pr;
    private Properties props;

    static {
        try {
            OAuth2SaslClientFactory.init();
        } catch (Throwable unused) {
        }
    }

    public IMAPSaslAuthenticator(IMAPProtocol iMAPProtocol, String str, Properties properties, MailLogger mailLogger, String str2) {
        this.f43923pr = iMAPProtocol;
        this.name = str;
        this.props = properties;
        this.logger = mailLogger;
        this.host = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    @Override // com.sun.mail.imap.protocol.SaslAuthenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean authenticate(java.lang.String[] r18, final java.lang.String r19, java.lang.String r20, final java.lang.String r21, final java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.protocol.IMAPSaslAuthenticator.authenticate(java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
