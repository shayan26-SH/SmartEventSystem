package Creational;

// ================================
// CREATIONAL PATTERN START
// Pattern: Abstract Factory
// This interface defines methods for creating related event objects.
// ================================

public interface EventFactory {
    Room createRoom();
    Equipment createEquipment();
    AccessControl createAccessControl();
}