package com.google.api.client.extensions.java6.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.AuthorizationCodeRequestUrl;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.util.Preconditions;
import java.awt.Desktop;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class AuthorizationCodeInstalledApp {
    private static final Logger LOGGER = Logger.getLogger(AuthorizationCodeInstalledApp.class.getName());
    private final AuthorizationCodeFlow flow;
    private final VerificationCodeReceiver receiver;

    public AuthorizationCodeInstalledApp(AuthorizationCodeFlow authorizationCodeFlow, VerificationCodeReceiver verificationCodeReceiver) {
        this.flow = (AuthorizationCodeFlow) Preconditions.checkNotNull(authorizationCodeFlow);
        this.receiver = (VerificationCodeReceiver) Preconditions.checkNotNull(verificationCodeReceiver);
    }

    public static void browse(String str) {
        Preconditions.checkNotNull(str);
        System.out.println("Please open the following address in your browser:");
        PrintStream printStream = System.out;
        String strValueOf = String.valueOf(str);
        printStream.println(strValueOf.length() != 0 ? "  ".concat(strValueOf) : new String("  "));
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    System.out.println("Attempting to open that address in the default browser now...");
                    desktop.browse(URI.create(str));
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Unable to open browser", (Throwable) e);
        } catch (InternalError e2) {
            LOGGER.log(Level.WARNING, "Unable to open browser", (Throwable) e2);
        }
    }

    public Credential authorize(String str) {
        try {
            Credential credentialLoadCredential = this.flow.loadCredential(str);
            if (credentialLoadCredential != null && (credentialLoadCredential.getRefreshToken() != null || credentialLoadCredential.getExpiresInSeconds() == null || credentialLoadCredential.getExpiresInSeconds().longValue() > 60)) {
                return credentialLoadCredential;
            }
            String redirectUri = this.receiver.getRedirectUri();
            onAuthorization(this.flow.newAuthorizationUrl().setRedirectUri(redirectUri));
            return this.flow.createAndStoreCredential(this.flow.newTokenRequest(this.receiver.waitForCode()).setRedirectUri(redirectUri).execute(), str);
        } finally {
            this.receiver.stop();
        }
    }

    public final AuthorizationCodeFlow getFlow() {
        return this.flow;
    }

    public final VerificationCodeReceiver getReceiver() {
        return this.receiver;
    }

    public void onAuthorization(AuthorizationCodeRequestUrl authorizationCodeRequestUrl) {
        browse(authorizationCodeRequestUrl.build());
    }
}
