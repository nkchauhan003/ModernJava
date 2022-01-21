package com.tb.java17;

import java.util.List;

public class SealedClass {
}

// must have at least one sub-class
sealed class Vehicle {
}

//  must be either - "final", "sealed" or "non-sealed"
final class Car extends Vehicle {
}

//  must be either - "final", "sealed" or "non-sealed"
non-sealed class Train extends Vehicle {
}

// must have at least one implementation
sealed interface Human {
}

// must have at least one implementation
final class Men implements Human {
}
