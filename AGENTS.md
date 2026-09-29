# com-etzhayyim-tate repository rules

- This repository is an independent flat-path west project.
- EDN is canonical. Generated JSON is a wire projection only; do not commit JSON,
  JSON-LD, or BPMN artifacts outside an explicitly declared `wire/` directory.
- Keep implementation in `src/tate/`, tests in `test/tate/`, schema in `schema/`,
  and registries in `data/`.
- Do not reintroduce Go, TinyGo, shell runners, Python ports, or monorepo-relative
  paths.
- Preserve the non-adjudication, UPL/self-submit, deadline-honesty,
  jurisdiction-honesty, fake-notice guard, and referral-forward invariants.
- Run `kbb -M:test` before publishing changes.
