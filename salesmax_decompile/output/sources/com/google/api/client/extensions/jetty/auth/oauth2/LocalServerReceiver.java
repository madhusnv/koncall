package com.google.api.client.extensions.jetty.auth.oauth2;

import com.google.api.client.extensions.java6.auth.oauth2.VerificationCodeReceiver;
import com.google.api.client.util.Throwables;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Semaphore;
import p001o.bgf;
import p001o.lt3;
import p001o.o48;
import p001o.p48;
import p001o.s7;
import p001o.vle;

/* loaded from: classes3.dex */
public final class LocalServerReceiver implements VerificationCodeReceiver {
    private static final String CALLBACK_PATH = "/Callback";
    private static final String LOCALHOST = "localhost";
    private final String callbackPath;
    String code;
    String error;
    private String failureLandingPageUrl;
    private final String host;
    private int port;
    private bgf server;
    private String successLandingPageUrl;
    final Semaphore waitUnlessSignaled;

    public static final class Builder {
        private String failureLandingPageUrl;
        private String successLandingPageUrl;
        private String host = LocalServerReceiver.LOCALHOST;
        private int port = -1;
        private String callbackPath = LocalServerReceiver.CALLBACK_PATH;

        public LocalServerReceiver build() {
            return new LocalServerReceiver(this.host, this.port, this.callbackPath, this.successLandingPageUrl, this.failureLandingPageUrl);
        }

        public String getCallbackPath() {
            return this.callbackPath;
        }

        public String getHost() {
            return this.host;
        }

        public int getPort() {
            return this.port;
        }

        public Builder setCallbackPath(String str) {
            this.callbackPath = str;
            return this;
        }

        public Builder setHost(String str) {
            this.host = str;
            return this;
        }

        public Builder setLandingPages(String str, String str2) {
            this.successLandingPageUrl = str;
            this.failureLandingPageUrl = str2;
            return this;
        }

        public Builder setPort(int i) {
            this.port = i;
            return this;
        }
    }

    public class CallbackHandler extends s7 {
        public CallbackHandler() {
        }

        private void writeLandingHtml(p48 p48Var) {
            p48Var.mo17706e(200);
            p48Var.mo17096a("text/html");
            PrintWriter printWriterMo17098d = p48Var.mo17098d();
            printWriterMo17098d.println("<html>");
            printWriterMo17098d.println("<head><title>OAuth 2.0 Authentication Token Received</title></head>");
            printWriterMo17098d.println("<body>");
            printWriterMo17098d.println("Received verification code. You may now close this window.");
            printWriterMo17098d.println("</body>");
            printWriterMo17098d.println("</html>");
            printWriterMo17098d.flush();
        }

        @Override // p001o.iw7
        public void handle(String str, o48 o48Var, p48 p48Var, int i) {
            if (LocalServerReceiver.CALLBACK_PATH.equals(str)) {
                try {
                    ((vle) o48Var).m52947y(true);
                    LocalServerReceiver.this.error = o48Var.getParameter(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                    LocalServerReceiver.this.code = o48Var.getParameter("code");
                    LocalServerReceiver localServerReceiver = LocalServerReceiver.this;
                    if (localServerReceiver.error != null || localServerReceiver.successLandingPageUrl == null) {
                        LocalServerReceiver localServerReceiver2 = LocalServerReceiver.this;
                        if (localServerReceiver2.error == null || localServerReceiver2.failureLandingPageUrl == null) {
                            writeLandingHtml(p48Var);
                        } else {
                            p48Var.mo17705b(LocalServerReceiver.this.failureLandingPageUrl);
                        }
                    } else {
                        p48Var.mo17705b(LocalServerReceiver.this.successLandingPageUrl);
                    }
                    p48Var.mo17097c();
                } finally {
                    LocalServerReceiver.this.waitUnlessSignaled.release();
                }
            }
        }
    }

    public LocalServerReceiver() {
        this(LOCALHOST, -1, CALLBACK_PATH, null, null);
    }

    public String getCallbackPath() {
        return this.callbackPath;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    @Override // com.google.api.client.extensions.java6.auth.oauth2.VerificationCodeReceiver
    public String getRedirectUri() throws IOException {
        int i = this.port;
        if (i == -1) {
            i = 0;
        }
        bgf bgfVar = new bgf(i);
        this.server = bgfVar;
        lt3 lt3Var = bgfVar.m18894H()[0];
        lt3Var.mo24448o(this.host);
        this.server.m18892F(new CallbackHandler());
        try {
            this.server.start();
            this.port = lt3Var.getLocalPort();
            String strValueOf = String.valueOf(this.host);
            int i2 = this.port;
            String strValueOf2 = String.valueOf(this.callbackPath);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 19 + strValueOf2.length());
            sb.append("http://");
            sb.append(strValueOf);
            sb.append(":");
            sb.append(i2);
            sb.append(strValueOf2);
            return sb.toString();
        } catch (Exception e) {
            Throwables.propagateIfPossible(e);
            throw new IOException(e);
        }
    }

    @Override // com.google.api.client.extensions.java6.auth.oauth2.VerificationCodeReceiver
    public void stop() throws IOException {
        this.waitUnlessSignaled.release();
        bgf bgfVar = this.server;
        if (bgfVar != null) {
            try {
                bgfVar.stop();
                this.server = null;
            } catch (Exception e) {
                Throwables.propagateIfPossible(e);
                throw new IOException(e);
            }
        }
    }

    @Override // com.google.api.client.extensions.java6.auth.oauth2.VerificationCodeReceiver
    public String waitForCode() throws IOException {
        this.waitUnlessSignaled.acquireUninterruptibly();
        if (this.error == null) {
            return this.code;
        }
        String strValueOf = String.valueOf(this.error);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
        sb.append("User authorization failed (");
        sb.append(strValueOf);
        sb.append(")");
        throw new IOException(sb.toString());
    }

    public LocalServerReceiver(String str, int i, String str2, String str3) {
        this(str, i, CALLBACK_PATH, str2, str3);
    }

    public LocalServerReceiver(String str, int i, String str2, String str3, String str4) {
        this.waitUnlessSignaled = new Semaphore(0);
        this.host = str;
        this.port = i;
        this.callbackPath = str2;
        this.successLandingPageUrl = str3;
        this.failureLandingPageUrl = str4;
    }
}
