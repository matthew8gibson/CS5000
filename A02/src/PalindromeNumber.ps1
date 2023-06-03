$TestData = Import-Csv /Users/matgib/repos/CS5000/A02/src/PalindromeNumber.csv
$TestData.count

foreach ($Jello in ($TestData | Select-Object -First 10005)) {
  # note to self, PS Properties on object starting with digit -- is bad; makes stuff not work. 
  #$property = ($Jello) | Select-String TestNumber
  #$property = ($Jello) | Select-Object TestNumber
  #$property = ($Jello).TestNumber
  $property = $Jello.TestNumber
  #$property  
  /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-20.jdk/Contents/Home/bin/java --enable-preview  -cp /Users/matgib/repos/CS5000/A02/bin PalindromeNumber $property

}

