# 2469. Convert the Temperature

## Overview

This Java class, `Solution`, provides a method `convertTemperature` to convert temperatures from Celsius to Kelvin and Fahrenheit.

## Method: `convertTemperature`

The `convertTemperature` method takes a temperature in Celsius (`c`) as input and returns an array containing the equivalent temperatures in Kelvin and Fahrenheit.

## Steps
### 1. Convert to Kelvin:
- Calculate the temperature in Kelvin (`k`) by adding 273.15 to the temperature in Celsius.

### 2. Convert to Fahrenheit:
- Calculate the temperature in Fahrenheit (`f`) using the formula `1.8 * c + 32`.

### 3. Return Result Array:
- Create an array `ans` containing the calculated values of `k` and `f`.

### 4. Return the Result:
- Return the array `ans`.
