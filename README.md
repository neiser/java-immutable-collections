# Immutable Collections for Java

This is work-in-progress!

## Usage

This library provides immutable variants of Collection-like Java interfaces. For example, the `List<E>` interface can be
wrapped into
`ImmutableList<E>` using `AlmostImmutableList.wrap`. The main focus is that new projects and use type-safe immutable
variants throughout the code and use `AlmostImmutableList.wrap` and `AlmostImmutableList.unwrap`
whenever interfacing with other libraries or not yet migrated code.

### TODO and Internal Notes

* Discuss https://nipafx.dev/immutable-collections-in-java/
* Include/mention https://github.com/brianburton/java-immutable-collections
* Add Jackson module
* Add `.of` factory method support