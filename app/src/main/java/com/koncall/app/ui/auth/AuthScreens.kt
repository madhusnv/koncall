package com.koncall.app.ui.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.koncall.app.ui.components.GradientButton
import com.koncall.app.ui.components.KonCallGradients
import com.koncall.app.ui.theme.KonCallColors

@Composable
fun OrgCodeScreen(
    onOrgCodeSubmit: (String) -> Unit
) {
    var orgCode by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(KonCallColors.BackgroundDeep)
    ) {
        // Subtle background gradient
        Box(
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.05f)
                .background(KonCallGradients.primaryGradient)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Surface(
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(20.dp),
                color = KonCallColors.SurfaceElevated
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "K",
                        style = MaterialTheme.typography.displayMedium,
                        fontWeight = FontWeight.Bold,
                        color = KonCallColors.Teal
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            Text(
                text = "KonCall",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold,
                color = KonCallColors.TextPrimary
            )
            
            Text(
                text = "Premium Call Tracking CRM",
                style = MaterialTheme.typography.bodyLarge,
                color = KonCallColors.TextSecondary
            )
            
            Spacer(modifier = Modifier.height(48.dp))
            
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard),
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Enter Organization Code",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = KonCallColors.TextPrimary
                    )
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    OutlinedTextField(
                        value = orgCode,
                        onValueChange = { 
                            orgCode = it.uppercase().take(10)
                            error = null
                        },
                        label = { Text("Code") },
                        placeholder = { Text("e.g. ABCDEF") },
                        singleLine = true,
                        isError = error != null,
                        supportingText = { error?.let { Text(it, color = KonCallColors.Error) } },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Text,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier.fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = KonCallColors.Teal,
                            unfocusedBorderColor = KonCallColors.SurfaceElevated,
                            focusedTextColor = KonCallColors.TextPrimary,
                            unfocusedTextColor = KonCallColors.TextPrimary,
                            cursorColor = KonCallColors.Teal,
                            focusedLabelColor = KonCallColors.Teal,
                            unfocusedLabelColor = KonCallColors.TextSecondary
                        ),
                        shape = RoundedCornerShape(12.dp)
                    )
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    GradientButton(
                        onClick = {
                            if (orgCode.length >= 4) {
                                onOrgCodeSubmit(orgCode)
                            } else {
                                error = "Code must be at least 4 characters"
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        enabled = orgCode.isNotEmpty()
                    ) {
                        Text("Continue", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

@Composable
fun LoginScreen(
    viewModel: LoginViewModel,
    orgCode: String,
    onLoginSuccess: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    
    var phone by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var isRegistering by remember { mutableStateOf(false) }

    LaunchedEffect(uiState.isLoggedIn) {
        if (uiState.isLoggedIn) {
            onLoginSuccess()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(KonCallColors.BackgroundDeep)
    ) {
        // Subtle background gradient
        Box(
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.05f)
                .background(KonCallGradients.primaryGradient)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = if (isRegistering) "Create Account" else "Welcome Back",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold,
                color = KonCallColors.TextPrimary
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = KonCallColors.SurfaceElevated
            ) {
                Text(
                    text = "ORG: $orgCode",
                    style = MaterialTheme.typography.labelMedium,
                    color = KonCallColors.Teal,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            
            Spacer(modifier = Modifier.height(32.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard),
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(modifier = Modifier.padding(24.dp)) {
                    if (isRegistering) {
                        OutlinedTextField(
                            value = name,
                            onValueChange = { name = it },
                            label = { Text("Full Name") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = KonCallColors.Teal,
                                unfocusedBorderColor = KonCallColors.SurfaceElevated,
                                focusedTextColor = KonCallColors.TextPrimary,
                                unfocusedTextColor = KonCallColors.TextPrimary,
                                cursorColor = KonCallColors.Teal,
                                focusedLabelColor = KonCallColors.Teal,
                                unfocusedLabelColor = KonCallColors.TextSecondary
                            ),
                            shape = RoundedCornerShape(12.dp)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    
                    OutlinedTextField(
                        value = phone,
                        onValueChange = { phone = it.filter { c -> c.isDigit() || c == '+' } },
                        label = { Text("Phone Number") },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        modifier = Modifier.fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = KonCallColors.Teal,
                            unfocusedBorderColor = KonCallColors.SurfaceElevated,
                            focusedTextColor = KonCallColors.TextPrimary,
                            unfocusedTextColor = KonCallColors.TextPrimary,
                            cursorColor = KonCallColors.Teal,
                            focusedLabelColor = KonCallColors.Teal,
                            unfocusedLabelColor = KonCallColors.TextSecondary
                        ),
                        shape = RoundedCornerShape(12.dp)
                    )
                    
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier.fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = KonCallColors.Teal,
                            unfocusedBorderColor = KonCallColors.SurfaceElevated,
                            focusedTextColor = KonCallColors.TextPrimary,
                            unfocusedTextColor = KonCallColors.TextPrimary,
                            cursorColor = KonCallColors.Teal,
                            focusedLabelColor = KonCallColors.Teal,
                            unfocusedLabelColor = KonCallColors.TextSecondary
                        ),
                        shape = RoundedCornerShape(12.dp)
                    )
                    
                    uiState.error?.let { error ->
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = error,
                            color = KonCallColors.Error,
                            style = MaterialTheme.typography.bodySmall,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    }
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    GradientButton(
                        onClick = {
                            if (isRegistering) {
                                viewModel.register(orgCode, phone, name, password)
                            } else {
                                viewModel.login(orgCode, phone, password)
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        enabled = !uiState.isLoading && phone.isNotEmpty() && password.isNotEmpty() &&
                                (!isRegistering || name.isNotEmpty())
                    ) {
                        if (uiState.isLoading) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(24.dp),
                                color = Color.White
                            )
                        } else {
                            Text(
                                if (isRegistering) "Create Account" else "Login",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            TextButton(
                onClick = { isRegistering = !isRegistering }
            ) {
                Text(
                    if (isRegistering) "Already have an account? Login" 
                    else "Don't have an account? Register",
                    color = KonCallColors.Teal
                )
            }
        }
    }
}
