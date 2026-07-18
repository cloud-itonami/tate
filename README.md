# tate 盾

Citizen legal-defense concierge actor for public, non-adjudicating legal
information. It maps received notices and contract patterns to disclosed
statutory anchors, self-submit options, and professional referrals. It never
calculates calendar deadlines, represents a member, or decides legal validity.

This is the standalone west repository `etzhayyim/com-etzhayyim-tate`.
EDN is canonical for actor metadata, registries, schema, and state. JSON emitted
by the web/case generators is a wire projection only and is not canonical.

```bash
bb test
bb -m tate.methods.coverage-report
bb -m tate.methods.datom-emit
```

Layout:

- `actor.edn`, `identity.edn`, `manifest.edn`, `dependencies.edn`: contracts
- `data/`: public registries and synthetic seed documents
- `schema/tate.edn`: actor-owned schema
- `src/tate/`: implementation and cells
- `test/tate/`: standalone test suite

All legal anchors require current-law verification. High-stakes cases remain
referral-forward.
