resolvers in ThisBuild += "lightbend-commercial-mvn" at
  "https://repo.lightbend.com/pass/zt7H7qu6XjkaFzRsR72pkFK4ws5gHysc4Lguq5KNDmwUeUIF/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
  url("https://repo.lightbend.com/pass/zt7H7qu6XjkaFzRsR72pkFK4ws5gHysc4Lguq5KNDmwUeUIF/commercial-releases"))(Resolver.ivyStylePatterns)