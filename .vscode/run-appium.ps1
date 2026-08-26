$projectPom = Join-Path $PSScriptRoot '..\influencer-marketing\pom.xml'

$mavenArguments = @(
    '-f', $projectPom,
    '-Dexec.classpathScope=test',
    '-Dexec.mainClass=com.influencer.marketing.AppiumConnectionTest',
    'org.codehaus.mojo:exec-maven-plugin:3.5.0:java'
)

& mvn @mavenArguments
exit $LASTEXITCODE
